FROM debian:stable-slim AS build-env

FROM gcr.io/distroless/base-debian11

WORKDIR /

# Distroless doesn't come with this lib
COPY --from=build-env /lib/x86_64-linux-gnu/libz.so.1 /lib/x86_64-linux-gnu/libz.so.1
COPY --from=build-env /lib/x86_64-linux-gnu/libc.so.6 /lib/x86_64-linux-gnu/libc.so.6

COPY build/native/nativeCompile/micronautguide /app

EXPOSE 8080

USER nonroot:nonroot

ENTRYPOINT ["/app"]
