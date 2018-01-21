package spitter;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
    @NotNull
    @Size(min = 5, max = 30, message = "{username.size}")
    private String username;

    @NotNull
    @Size(min = 2, max = 30, message = "{firstname.size}")
    private String firstname;

    @NotNull
    @Size(min = 2, max = 30, message = "{lastname.size}")
    private String lastname;
    @NotNull
    @Size(min = 2, max = 30, message = "{password.size}")
    private String password;

    @NotNull
    @Size(min = 2, max = 30, message = "{email.valid}")
    private String email;
}
