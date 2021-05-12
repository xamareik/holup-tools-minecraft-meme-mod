package xamareik.holup.tools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;




public class HolupTools implements ModInitializer {
	public static final Item HOLUP = new Item(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("holuptools", "holup"), HOLUP);
	}
}
