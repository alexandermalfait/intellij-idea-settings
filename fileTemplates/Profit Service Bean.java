import be.profitplus.server.PPServlet;
import com.google.inject.Singleton;
import com.wideplay.warp.persist.Transactional;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Singleton
@Transactional(rollbackOn = Exception.class)
public class ${SERVICE_NAME}Bean extends PPServlet implements ${SERVICE_NAME} {

}