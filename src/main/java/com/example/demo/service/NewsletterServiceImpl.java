package com.example.demo.service;
import com.example.demo.entity.Newsletter;
import com.example.demo.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NewsletterServiceImpl implements NewsletterService {
    @Autowired
    private NewsletterRepository newsletterRepository;

    @Override
    public Newsletter saveNewsletter(Newsletter newsletter){
        return newsletterRepository.save(newsletter);
    }

    @Override public List<Newsletter> fetchNewsletterList(){
        return (List<Newsletter>) newsletterRepository.findAll();
    }

    @Override
    public void deleteNewsletterById(Long newsletterId){
        newsletterRepository.deleteById(newsletterId);
    }
}
