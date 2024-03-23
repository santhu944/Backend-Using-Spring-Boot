package com.codewithsanthosh.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	private int id;
	private String name;

//	@Email(message = "Email address is not valid !!")
//	@NotEmpty(message = "Email is required !!")
	private String email;

//	@NotEmpty
//	@Size(min = 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars !!")


	private String password;

//	@NotEmpty
	private String about;
}
