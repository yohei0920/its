package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {
    final IssueRepository issueRepository;
    public List<IssueEntity> findAll() {
        return issueRepository.findAll();
    }

    @Transactional
    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }

    public IssueEntity findById(long issueId) {
        return issueRepository.findById(issueId);
    }
}
