package at.ac.tuwien.sepm.assignment.individual.service;

import at.ac.tuwien.sepm.assignment.individual.entity.Breed;
import at.ac.tuwien.sepm.assignment.individual.exception.NotFoundException;

public interface BreedService {


    /**
     * Gets the breed with a given ID.
     * @param id of the owner to find.
     * @return the owner with the specified id.
     * @throws RuntimeException  if something goes wrong during data processing.
     * @throws NotFoundException if the owner could not be found in the system.
     */
    Breed getOneById(Long id);

}
