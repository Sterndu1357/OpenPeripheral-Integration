package openperipheral.integration.vanilla;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import openperipheral.api.helpers.ItemStackMetaProviderSimple;

public class ItemToolMetaProvider extends ItemStackMetaProviderSimple<ItemTool> {

	@Override
	public String getKey() {
		return "tool";
	}

	@Override
	public Object getMeta(ItemTool target, ItemStack stack) {
		Map<String, Object> result = Maps.newHashMap();
		result.put("material", target.getToolMaterialName());
		return result;
	}

}
