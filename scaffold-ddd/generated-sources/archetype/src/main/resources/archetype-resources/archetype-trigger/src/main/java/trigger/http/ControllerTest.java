#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.trigger.http;

import ${package}.api.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest implements IOrderService {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
