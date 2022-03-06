
/*
    * The File Path where the file is located in the system
    * It also includes a ConfigExamplePlugin.java with 0 bytes 
    * home/matthew/Documents/runelite/runelite-client/src/main/java/net/runelite/client/plugins/configexample
    * The following program is an example pulled from osrsbox online 
*/


package net.runelite.client.plugins.configexample;

@Inject
private ConfigExampleConfig config;

// Mandatory imports
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@PluginDescriptor(
        name = "Config Example",
        description = "A simple example plugin to illustrate how to write plugin config menus",
        tags = {"config", "menu"},
        loadWhenOutdated = true,
        enabledByDefault = false
)

@ConfigGroup("configexample")
public interface ConfigExampleConfig extends Config
{
    // Configuration menu items go here
}

@ConfigItem
(
        position = 1,
        keyName = "booleanConfig",
        name = "Boolean Checkbox",
        description = "Simple example of a checkbox to store booleans"
)
default boolean booleanConfig() { return false; }

@ConfigItem(
        position = 2,
        keyName = "intConfig",
        name = "Int Spinner",
        description = "Simple example of a spinner to store integers"
)
default int intConfig() { return 1; }

@ConfigItem(
        position = 3,
        keyName = "stringConfig",
        name = "String Textbox",
        description = "Simple example of a textbox to store strings"
)
default String stringConfig() { return ""; }

@ConfigItem(
        position = 4,
        keyName = "colorConfig",
        name = "Color Selector",
        description = "Simple example of a color selector"
)
default Color colorConfig() { return Color.GREEN; }

enum OptionEnum
{
OPTION1,
OPTION2,
OPTION3
}

@ConfigItem(
        position = 5,
        keyName = "enumConfig",
        name = "Combobox Enum",
        description = "Simple example of a combobox to select from a list"
)
default OptionEnum enumConfig() { return OptionEnum.OPTION1; }

@ConfigItem(
        position = 6,
        keyName = "dimensionConfig",
        name = "Int Dimension",
        description = "Simple example of a dimension to select to integer values"
)
default Dimension dimensionConfig() { return new Dimension(765, 503); }


