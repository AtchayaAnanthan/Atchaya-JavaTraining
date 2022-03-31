package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class ServiceControllerForFeign {

@GetMapping("/name")
public String getName() {
return "Atchu";
}
@GetMapping("/PhoneNo")
public String PhoneNo() {
return "9487673434";}
@GetMapping("/Place")
public String place() {
return "Trichy";}
}