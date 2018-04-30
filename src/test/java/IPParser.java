import com.thoughtworks.gauge.execution.parameters.parsers.base.CustomParameterParser;
import gauge.messages.Spec;

public class IPParser extends CustomParameterParser<IP> {
    @Override
    protected IP customParse(Class aClass, Spec.Parameter parameter) {
        String[] v = parameter.getValue().split("\\.");
        return new IP(v[0], v[1], v[2], v[3]);
    }

    @Override
    public boolean canParse(Class<?> aClass, Spec.Parameter parameter) {
        try {
            String[] v = parameter.getValue().split("\\.");
            return v.length == 4;
        }catch (Exception e){
            return false;
        }
    }
}
