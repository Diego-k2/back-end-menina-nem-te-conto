package com.example.demo.service;
import com.example.demo.entity.Newsletter;

import java.util.List;

public interface NewsletterService {

    Newsletter saveNewsletter (Newsletter newsletter);

    List<Newsletter> fetchNewsletterList();

    void deleteNewsletterById(Long newsletterId);
}
