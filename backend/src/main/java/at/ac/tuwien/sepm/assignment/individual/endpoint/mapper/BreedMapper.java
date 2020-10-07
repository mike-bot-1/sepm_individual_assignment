package at.ac.tuwien.sepm.assignment.individual.endpoint.mapper;

import at.ac.tuwien.sepm.assignment.individual.endpoint.dto.BreedDto;
import at.ac.tuwien.sepm.assignment.individual.entity.Breed;
import org.springframework.stereotype.Component;

@Component
public class BreedMapper {

    public BreedDto entityToDto(Breed breed) {
        return new BreedDto(breed.getId(), breed.getName());
    }

}
