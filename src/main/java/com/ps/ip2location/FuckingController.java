package com.ps.ip2location;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;

@RestController
@CrossOrigin
public class FuckingController {

    @RequestMapping("/")
    public void sendHeader(HttpServletRequest httpServletRequest){

        Enumeration<String> header = httpServletRequest.getHeaderNames();
        HashMap<String, String> headers = new HashMap();

        while(header.hasMoreElements()){
            String head = header.nextElement();
            headers.put(head, httpServletRequest.getHeader(head));
        }

        System.out.println(headers);

    }


}
