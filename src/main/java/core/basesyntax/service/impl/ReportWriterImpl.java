package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportWriterService;
import java.util.ArrayList;
import java.util.List;

public class ReportWriterImpl implements ReportWriterService {
    private final List<String[]> report = new ArrayList<>();

    public List<String[]> getReport() {
        writeHead();
        writeBody(Storage.getAll());
        return new ArrayList<String[]>(report);
    }

    private void writeHead() {
        report.add(new String[]{"fruit", "quantity"});
    }

    private void writeBody(List<String[]> fruits) {
        report.addAll(fruits);
    }
}
