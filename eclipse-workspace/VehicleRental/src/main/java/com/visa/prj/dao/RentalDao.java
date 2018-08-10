package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.dto.RentalReportDTO;
import com.visa.prj.entity.Rental;

public interface RentalDao {
void addRental(Rental r);
List<RentalReportDTO> getReport();
}
