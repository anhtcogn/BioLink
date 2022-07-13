package com.example.demo;

import com.example.demo.model.entity.DesignEntity;
import com.example.demo.model.entity.ProfileEntity;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.DesignService;
import com.example.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private DesignService designService;

    @Autowired
    private ProfileRepository profileRepository;
    @Override
    public void run(String... args) throws Exception {
        DesignEntity design1 = new DesignEntity();
        design1.setName("Basics");
        design1.setBackground("#FFFFFF");
        design1.setBtnRadius("30px");
        design1.setBtnBg("#FFFFFF");
        design1.setBtnBorder("0px solid #FFFFFF");
        design1.setBoxShadow("rgb(24 39 75 / 12%) 0px 6px 14px -6px , rgb(24 39 75 / 10%) 0px 10px 32px -4px , rgb(24 39 75 / 5%) 0px 0px 2px 1px inset");
        design1.setColor("#000000");

        DesignEntity design2 = new DesignEntity();
        design2.setName("Carbon");
        design2.setBackground("#131212");
        design2.setBtnRadius("8px");
        design2.setBtnBg("#212121");
        design2.setBtnBorder("0px solid #FFFFFF");
        design2.setBoxShadow("rgb(24 39 75 / 12%) 0px 6px 14px -6px , rgb(24 39 75 / 10%) 0px 10px 32px -4px , rgb(255 255 255 / 5%) 0px 0px 2px 1px inset");
        design2.setColor("#ffffff");

        DesignEntity design3 = new DesignEntity();
        design3.setName("Sunny");
        design3.setBackground("#fefceb");
        design3.setBtnRadius("30px");
        design3.setBtnBg("#FFDD00");
        design3.setBtnBorder("0px solid #FFDD00");
        design3.setBoxShadow("rgb(24 39 75 / 12%) 0px 6px 14px -6px , rgb(24 39 75 / 10%) 0px 10px 32px -4px , rgb(255 255 255 / 5%) 0px 0px 2px 1px inset");
        design3.setColor("#000000");

        DesignEntity design4 = new DesignEntity();
        design4.setName("Leaf");
        design4.setBackground("#f5fdf4");
        design4.setBtnRadius("30px");
        design4.setBtnBg("#A6EB99");
        design4.setBtnBorder("0px solid #FF9877");
        design4.setBoxShadow("");
        design4.setColor("#000000");

        DesignEntity design5 = new DesignEntity();
        design5.setName("Unicorn");
        design5.setBackground("#f8f8fe");
        design5.setBtnRadius("12px");
        design5.setBtnBg("#BFB9FA");
        design5.setBtnBorder("0px solid #FF9877");
        design5.setBoxShadow("");
        design5.setColor("#000000");

        ProfileEntity profile = new ProfileEntity();
        profile.setName("Tran Ngoc Anh");
        profile.setBio("khong co chi");


        designService.update(design1);
        designService.update(design2);
        designService.update(design3);
        designService.update(design4);
        designService.update(design5);
        profileRepository.save(profile);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
