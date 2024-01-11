package nl.mpi.transcriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

public class ScriptEngineManagerUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScriptEngineManagerUtils.class);

    private ScriptEngineManagerUtils() {
    }

    public void listEngines() {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> engines = manager.getEngineFactories();

        for (ScriptEngineFactory engine : engines) {
            LOGGER.info("Engine name: {}", engine.getEngineName());
            LOGGER.info("Version: {}", engine.getEngineVersion());
            LOGGER.info("Language: {}", engine.getLanguageName());

            LOGGER.info("Short Names:");
            for (String names : engine.getNames()) {
                LOGGER.info(names);
            }
        }
    }

}
