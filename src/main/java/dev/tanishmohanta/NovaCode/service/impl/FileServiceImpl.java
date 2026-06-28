package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.file.FileContentResponse;
import dev.tanishmohanta.NovaCode.dto.file.FileNode;
import dev.tanishmohanta.NovaCode.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
