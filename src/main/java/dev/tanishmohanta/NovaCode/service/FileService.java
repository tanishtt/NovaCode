package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.file.FileContentResponse;
import dev.tanishmohanta.NovaCode.dto.file.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
