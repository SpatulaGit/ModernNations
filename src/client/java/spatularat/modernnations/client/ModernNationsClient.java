package spatularat.modernnations.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import spatularat.modernnations.client.command.MNationsCommand;

public class ModernNationsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(){

		CommandRegistrationCallback.EVENT.register(
				(dispatcher, registryAccess, environment) -> {
					MNationsCommand.register(dispatcher);
				}
		);
	}
}