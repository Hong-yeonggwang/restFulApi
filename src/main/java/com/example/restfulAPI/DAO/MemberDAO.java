package com.example.restfulAPI.DAO;

import com.example.restfulAPI.JPA.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface MemberDAO {
    public void joinMember();
}
