 package kodlama.io.renAcar.core.utilities.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdBrandsResponse {
    private int id;
    private String name;
}