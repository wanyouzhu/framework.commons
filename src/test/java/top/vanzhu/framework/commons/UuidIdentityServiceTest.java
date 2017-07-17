package top.vanzhu.framework.commons;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.LongStream;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.springframework.util.StringUtils.hasText;

public class UuidIdentityServiceTest {

    private UuidIdentityService identityService;

    @Before
    public void setup() {
        identityService = new UuidIdentityService();
    }

    @Test
    public void identityShouldBeReadable() {
        String identity = identityService.nextIdentity();
        assertTrue(hasText(identity));
        assertTrue(isNumeric(identity));
    }

    @Test
    public void identitiesShouldNotBeDuplicated() {
        long expectedNumberOfIds = 10;
        long numberOfDistinctIds = LongStream.range(0, expectedNumberOfIds).mapToObj(x -> identityService.nextIdentity()).distinct().count();
        assertThat(numberOfDistinctIds, is(expectedNumberOfIds));
    }

}