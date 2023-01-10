package pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet {
    private String id;
    private Item category;
    private String name;
    private List<String> photoUrls;
    private List<Item> tags;
    private String status;
}
