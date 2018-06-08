package com.pwittchen.search.twitter.ui;

import com.pwittchen.search.twitter.network.NetworkApi;
import com.pwittchen.search.twitter.twitter.TwitterApi;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<TwitterApi> twitterApiProvider;

  private final Provider<NetworkApi> networkApiProvider;

  public MainActivity_MembersInjector(
      Provider<TwitterApi> twitterApiProvider, Provider<NetworkApi> networkApiProvider) {
    assert twitterApiProvider != null;
    this.twitterApiProvider = twitterApiProvider;
    assert networkApiProvider != null;
    this.networkApiProvider = networkApiProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<TwitterApi> twitterApiProvider, Provider<NetworkApi> networkApiProvider) {
    return new MainActivity_MembersInjector(twitterApiProvider, networkApiProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.twitterApi = twitterApiProvider.get();
    instance.networkApi = networkApiProvider.get();
  }

  public static void injectTwitterApi(
      MainActivity instance, Provider<TwitterApi> twitterApiProvider) {
    instance.twitterApi = twitterApiProvider.get();
  }

  public static void injectNetworkApi(
      MainActivity instance, Provider<NetworkApi> networkApiProvider) {
    instance.networkApi = networkApiProvider.get();
  }
}
