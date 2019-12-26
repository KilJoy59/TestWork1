package main.service;

import main.model.CompositeKeyForReport;
import main.model.Report;
import main.repository.ReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportService {

    @Autowired
    ReportsRepository reportsRepository;

    public CompositeKeyForReport save(Report report) {
        return reportsRepository.save(report).getCompositeKeyForReport();
    }
}
