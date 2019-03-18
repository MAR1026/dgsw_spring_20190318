package kr.hs.dgsw.calculator_0318;

import org.springframework.stereotype.Service;

@Service
public class CalculatingServiceImpl implements CalculatingService{

    @Override
    public String calculate(int num1, int num2, String operator){
        int result = 0;

        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "÷" :
                result = num1 / num2;
                break;
        }

        return String.valueOf(result);
    }
}
