package top.vanzhu.framework.commons;

import com.fasterxml.uuid.Generators;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidIdentityService implements IdentityService {

    @Override
    public String nextIdentity() {
        UUID uuid = Generators.timeBasedGenerator().generate();
        return "0001" + Long.toString(uuid.timestamp());
    }

}
