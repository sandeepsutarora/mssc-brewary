package sutarinnovation.msscbrewary.web.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private UUID id;
    private String customerName;

    public static CustomerDTOBuilder builder() {
        return new CustomerDTOBuilder();
    }

    @Data
    public static class CustomerDTOBuilder {
        private UUID id;
        private String customerName;

        CustomerDTOBuilder() {
        }

        public CustomerDTOBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerDTOBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerDTO build() {
            return new CustomerDTO(id, customerName);
        }

    }
}
