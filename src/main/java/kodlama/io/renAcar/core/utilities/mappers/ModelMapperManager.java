package kodlama.io.renAcar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements ModelMapperService {

    private ModelMapper modelMapper;
    public ModelMapperManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    
    @Override
    public ModelMapper forResponse() {
       this.modelMapper.getConfiguration()
            .setAmbiguityIgnored(true)
            .setMatchingStrategy(MatchingStrategies.LOOSE);
       return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
            .setAmbiguityIgnored(true)
            .setMatchingStrategy(MatchingStrategies.STANDARD);
        return this.modelMapper;
    }
    
}
