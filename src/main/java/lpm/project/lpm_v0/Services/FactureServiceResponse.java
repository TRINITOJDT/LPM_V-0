package lpm.project.lpm_v0.Services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class FactureServiceResponse<T> {
    private String status;
    private T data;
}
