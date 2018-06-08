package com.pwittchen.search.twitter.di.module;

import com.pwittchen.search.twitter.network.NetworkApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideNetworkApiFactory implements Factory<NetworkApi> {
  private final NetworkModule module;

  public NetworkModule_ProvideNetworkApiFactory(NetworkModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public NetworkApi get() {
    return Preconditions.checkNotNull(
        module.provideNetworkApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<NetworkApi> create(NetworkModule module) {
    return new NetworkModule_ProvideNetworkApiFactory(module);
  }
}
