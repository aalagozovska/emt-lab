package mk.ukim.finki.emt.service.impl;

import mk.ukim.finki.emt.repository.CountryRepository;
import mk.ukim.finki.emt.service.CountryService;
import mk.ukim.finki.emt.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return this.countryRepository.findById(id);
    }

    @Override
    public Optional<Country> create(Country country) {
        return Optional.of(this.countryRepository.save(country));
    }
}