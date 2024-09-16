package hnt.coding.interview.design.creation.prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Setter
public class Computer implements Cloneable{
    private String os;
    private String office;
    private String antivirus;
    private String browser;
    private String others;
    private Integer version;
    List<Integer> releaseVersions;

    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
