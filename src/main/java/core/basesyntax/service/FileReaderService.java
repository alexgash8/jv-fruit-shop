package core.basesyntax.service;

import java.io.File;
import java.util.List;

public interface FileReaderService {
    void read(File input, OperationStrategy operationStrategy);
}
