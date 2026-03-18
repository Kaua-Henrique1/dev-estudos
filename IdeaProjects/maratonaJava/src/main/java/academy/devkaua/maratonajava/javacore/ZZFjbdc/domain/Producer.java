package academy.devkaua.maratonajava.javacore.ZZFjbdc.domain;

import lombok.Builder;
import lombok.Value;


// dessa forma fica imutável e é como declarasse o Builder, Hascode, Equals, Get...
@Value
@Builder
public class Producer {
    private Integer id;
    private String name;
}
