package de.bentzin.reke;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Ture Bentzin
 * @since 26-03-2024
 */
public class ConfigObject {

    @NotNull
    private String sqlitePath;
    @NotNull
    private List<Long> adminIds;

    private boolean writeEnabled = true;

    @NotNull
    public static ConfigObject defaultConfig() {
        ConfigObject configObject = new ConfigObject();
        configObject.setSqlitePath("data.sqlite");
        configObject.setAdminIds(List.of());
        return configObject;
    }

    @NotNull
    public String getSqlitePath() {
        return sqlitePath;
    }

    public void setSqlitePath(@NotNull String sqlitePath) {
        this.sqlitePath = sqlitePath;
    }

    @NotNull
    public List<Long> getAdminIds() {
        return adminIds;
    }

    public void setAdminIds(@NotNull List<Long> adminIds) {
        this.adminIds = adminIds;
    }

    public boolean isWriteEnabled() {
        return writeEnabled;
    }

    public void setWriteEnabled(boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
    }
}
