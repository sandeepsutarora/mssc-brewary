package sutarinnovation.msscbrewary.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
