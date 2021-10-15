package com.ab.crimereportingsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.crimereportingsystem.domains.Report;
import com.ab.crimereportingsystem.services.ReportService;

@Controller
@RequestMapping("admin/reportedCrime")
public class AdminReportController {
	
	private ReportService reportService;
	@Autowired
	public AdminReportController(ReportService reportService) {
		this.reportService = reportService;
	}
	
	@ModelAttribute(name="reports")
	public List<Report> getAll() {
		return  reportService.getAll(); 
		 
	}
	@ModelAttribute(name="unseen_reports")
	public List<Report> getUnseen() {
		return  reportService.getBySeen(false); 
		 
	}
	
	@GetMapping
	public String reportsView() {
		return "admin_report";
	}
	
	@PostMapping("/{id}")
	public String seen(@PathVariable("id") Long id) {
		Report report = reportService.getById(id);
		report.setSeen(true);
		reportService.update(report);
		return "redirect:/admin/reportedCrime";
	}
	
}
