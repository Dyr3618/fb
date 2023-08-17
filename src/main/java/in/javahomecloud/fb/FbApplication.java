package in.javahomecloud.fb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class FbApplication {
	@GetMapping("/getmsg")
	public String getMsg()
	{
		return "Hello Aws !!!!!  this is for testing";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(FbApplication.class, args);
	}

}
