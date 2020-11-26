package com.hendisantika.springbootthymeleafbootstrapwizard.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-wizard
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/11/20
 * Time: 05.55
 */
@Data
@NoArgsConstructor
public class Account {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String address;
    private Integer age;
    private boolean termsAccepted;
}
