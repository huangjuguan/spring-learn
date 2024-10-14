package bdbk.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源接口
 * @author huangjuguan
 * @since 2022-06-06
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
