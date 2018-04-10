package strategy;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class ComputeContextTest {

    @Test
    public void create() throws Exception {
        Optional<ComputeContext> optionalComputeContext = ComputeContext.create("add");
        ComputeContext computeContext = optionalComputeContext.orElseThrow(Exception::new);
        Assert.assertThat(4, CoreMatchers.equalTo(computeContext.getResult(2,2)));
    }
}