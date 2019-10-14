package com.wallet.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_wallet")
@Data
public class UserWallet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "users")
    @ManyToOne(fetch = FetchType.LAZY)
    private User users;
    @JoinColumn(name = "wallet")
    @ManyToOne(fetch = FetchType.LAZY)
    private Wallet wallet;
}
