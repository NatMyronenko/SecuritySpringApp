package security.Security.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Data
@Getter
@Setter
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "name cant be empty")
    @Size(min = 2,max = 100,message = "name should have size from 2 until 100 characters")
    @Column(name = "username")
    private String username;

    @Min(value = 1900, message = "birth year should be more than 1900")
    @Column(name = "year_of_birth")
    private long yearOfBirth;

    @Column(name = "password")
    private String password;

    public Person() {
    }
}
