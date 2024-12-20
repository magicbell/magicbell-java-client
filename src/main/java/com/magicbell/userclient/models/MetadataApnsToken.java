package com.magicbell.userclient.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class MetadataApnsToken {

  @NonNull
  private ApnsToken data;

  @NonNull
  private TokenMetadata metadata;
}
