package devPilot.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//import org.springframeWork.http.HttpStatus;
 @ResponseStatus(HttpStatus.UNAUTHORIZED)
 public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(String message){
        super(message);
    }
 }
