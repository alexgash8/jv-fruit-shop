package core.basesyntax.service.impl;

import core.basesyntax.service.FileWriterService;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterImpl implements FileWriterService {

    @Override
    public void writeTheResult(File file, List<String[]> report) {
        FileWriter csvWriter;
        {
            try {
                csvWriter = new FileWriter(file);
                for (String[] line: report) {
                    int count = 0;
                    for (String data : line) {
                        csvWriter.append(data);
                        if (count == 0) {
                            csvWriter.append(",");
                        }
                        count++;
                    }
                    csvWriter.append("\n");
                }
                csvWriter.flush();
                csvWriter.close();
            } catch (IOException e) {
                throw new RuntimeException("cant open file to write");
            }
        }
    }
}