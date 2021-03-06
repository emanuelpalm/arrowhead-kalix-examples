package se.arkalix.util.config.data;

import se.arkalix.dto.DtoWritableAs;

import java.util.Optional;

import static se.arkalix.dto.DtoEncoding.JSON;

@DtoWritableAs(JSON)
public interface OrMgmtProvider {
    String address();

    Optional<String> authenticationInfo();

    int port();

    String systemName();
}