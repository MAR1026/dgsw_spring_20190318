package kr.hs.dgsw.calculator_0318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalculatingService cs;

    @GetMapping("/calculator/{num1}/{num2}/{operator}")
    public String cal(@PathVariable int num1, @PathVariable int num2, @PathVariable String operator){
        return cs.calculate(num1, num2, operator);
    }
}
