package com.visa.prj.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.visa.prj.dao.CustomerDao;
import com.visa.prj.dao.CustomerDaoJPA;
import com.visa.prj.dao.RentalDao;
import com.visa.prj.dao.RentalDaoJPA;
import com.visa.prj.dao.VehicleDao;
import com.visa.prj.dao.VehicleDaoJPA;
import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Rental;
import com.visa.prj.entity.Vehicle;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page="index.jsp";
		String uri=request.getRequestURI();
		if(uri != null) {
			if(uri.endsWith("addVehicle.do")) {
				VehicleDao vehicledao=new VehicleDaoJPA();
				Vehicle v=new Vehicle();
				v.setRegNo(request.getParameter("regNo"));
				v.setFuelType(request.getParameter("fuelType"));
				v.setType(request.getParameter("vehicleType"));
				v.setCostPerKm(Double.parseDouble(request.getParameter("cost")));
				vehicledao.addVehicle(v);
				response.sendRedirect(page+"?msg=Vehicle added successfully!");
			}
			else if(uri.endsWith("addCustomer.do")) {
					CustomerDao customerdao=new CustomerDaoJPA();
					Customer v=new Customer();
					v.setEmail(request.getParameter("email"));
					v.setFullNAme(request.getParameter("full_name"));
					customerdao.addCustomer(v);
					response.sendRedirect(page+"?msg=Customer added successfully!");
					//client side redirection
			}
			else if(uri.endsWith("rentalForm.do")) {
				VehicleDao vehicledao=new VehicleDaoJPA();
				List<String> regNos=vehicledao.getRegNos();
				request.setAttribute("regNos", regNos);
				//server side redirection
				request.getRequestDispatcher("rentalForm2.jsp").forward(request, response);
			}
			else if(uri.endsWith("hireVehicle.do")) {
				RentalDao rentaldao=new RentalDaoJPA();
				Rental r=new Rental();
				r.setRentalAmount(Double.parseDouble(request.getParameter("rentalAmount")));
				r.setRentalDate(new Date());
				VehicleDao vehicledao=new VehicleDaoJPA();
				Vehicle v=vehicledao.getVehicle(request.getParameter("vehicle"));
				r.setVehicle(v);
				CustomerDao customerdao=new CustomerDaoJPA();
				Customer c=customerdao.getCustomer(Integer.parseInt(request.getParameter("customerId")));
				r.setCustomer(c);
				rentaldao.addRental(r);
				response.sendRedirect(page+"?msg=Rental added successfully!");
			}
			else if(uri.endsWith("report.do")) {
				RentalDao rentaldao=new RentalDaoJPA();
				request.setAttribute("reports", rentaldao.getReport());
				request.getRequestDispatcher("report.jsp").forward(request, response);
			}
			else if(uri.endsWith("login.do")) {
				//TODO: use customerdao to check if the customer is valid user or not
				
				/*
				 * true creates a session if session does not exist
				 * false => fetch existing session if already present, does not create
				 */
				HttpSession ses=request.getSession();  //request.getSession(boolean)
				ses.setAttribute("user", request.getParameter("user"));
				response.sendRedirect("index.jsp");
			}
			else if(uri.endsWith("logout.do")) {
				HttpSession ses=request.getSession(false);
				if(ses!=null) {
					ses.invalidate();
				}
			}
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
