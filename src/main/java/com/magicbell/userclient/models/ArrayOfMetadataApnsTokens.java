package com.magicbell.userclient.models;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class ArrayOfMetadataApnsTokens {

  private List<MetadataApnsToken> data;

  private Links links;
}
